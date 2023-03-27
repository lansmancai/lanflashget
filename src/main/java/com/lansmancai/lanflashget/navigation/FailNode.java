package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * 下载失败导航节点
 */
public class FailNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FAIL_NODE_IMAGE;
	}

	public String getText() {
		return "下载失败";
	}

}
