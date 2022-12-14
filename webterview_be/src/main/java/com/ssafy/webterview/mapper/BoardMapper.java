package com.ssafy.webterview.mapper;

import com.ssafy.webterview.entity.Board;
import com.ssafy.webterview.entity.Comment;

import java.util.List;

public interface BoardMapper {
	public List<Board> retrieveBoard();

	public Board detailBoard(int boardNo);

	public int insertBoard(Board board);

	public int updateBoard(Board board);

	public int deleteBoard(int boardNo);

	public int insertComment(Comment comment);

	public int deleteComment(int commentno);

	public int getTotalCount();
}