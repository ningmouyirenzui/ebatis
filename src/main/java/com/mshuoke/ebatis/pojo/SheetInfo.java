package com.mshuoke.ebatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class SheetInfo<T> {
	
	private Integer line;		// 总数据行数
	
	private String sheetName;	// sheet名称
	
	private Integer column;		// 列数
	
	private Integer correctLine;// 成功解析的数据行数
	
	// private List<Map<String,String>> info;	// 行信息
	private List<T> info;
	
	private List<Integer> blankLine; 	// 空行的行号
	
	private List<Integer> errorLine;	// 有问题的行号
	
	public SheetInfo(){
		this.line = 0;
		this.column = 0;
		this.correctLine = 0;
		this.info = new ArrayList<T>();
		this.blankLine = new ArrayList<Integer>();
		this.errorLine = new ArrayList<Integer>();
	}
	
	public List<Integer> getErrorLine() {
		return errorLine;
	}

	public void addErrorLine(Integer errorLine) {
		this.errorLine.add(errorLine);
	}

	public List<Integer> getBlankLine() {
		return blankLine;
	}

	public void addBlankLine(Integer blankLine) {
		this.blankLine.add(blankLine);
	}

	public Integer getCorrectLine() {
		return correctLine;
	}

	public void setCorrectLine(Integer correctLine) {
		this.correctLine = correctLine;
	}

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public String getSheetName() {
		return sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public List<T> getInfo() {
		return info;
	}

	public void setInfo(List<T> info) {
		this.info = info;
	}
	
	
}
