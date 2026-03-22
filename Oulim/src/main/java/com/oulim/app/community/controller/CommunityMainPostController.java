package com.oulim.app.community.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.community.dao.CommunityDAO;
import com.oulim.app.community.dao.CommunityFileDAO;
import com.oulim.app.community.dto.CommunityPostJoinDTO;
import com.oulim.app.community.dto.PostImageDTO;

public class CommunityMainPostController implements Execute {
	private String escapeJson(String str) {
	    if (str == null) return "";
	    return str.replace("\\", "\\\\")
	              .replace("\"", "\\\"")
	              .replace("\n", "\\n")
	              .replace("\r", "\\r")
	              .replace("\t", "\\t");
	}
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CommunityDAO commuDAO = new CommunityDAO();
		CommunityFileDAO commuFileDAO = new CommunityFileDAO();
		List<CommunityPostJoinDTO> postList = commuDAO.selectMainPost();

		try (PrintWriter out = response.getWriter()) {
			StringBuilder json = new StringBuilder();
			json.append("{");
			json.append("\"postList\":[");

			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			
			if (postList != null && !postList.isEmpty()) {

				postList.stream().forEach(x -> {
					List<PostImageDTO> imageList = commuFileDAO.select(x.getPostNo());
					System.out.println("==파일 확인==");
					System.out.println(imageList);
					System.out.println("===========");
					x.setImages(imageList);
				});

				for (int i = 0; i < postList.size(); i++) {
					CommunityPostJoinDTO post = postList.get(i);
					json.append("{");
					json.append("\"postNo\":\"").append(post.getPostNo()).append("\",");
					json.append("\"userNickname\":\"").append(escapeJson(post.getUserNickname())).append("\",");
					json.append("\"postTitle\":\"").append(escapeJson(post.getPostTitle())).append("\",");
					json.append("\"postImage\":\"").append(escapeJson(post.getImages().get(0).getPostImgSystemName())).append("\"");
					json.append("}");
					if (i < postList.size() - 1) {
						json.append(",");
					}
				}
				json.append("]");
				json.append("}");

				out.write(json.toString());
				out.flush();
			}
		}
		return null;
	}

}
