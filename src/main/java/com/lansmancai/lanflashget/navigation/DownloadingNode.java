package com.lansmancai.lanflashget.navigation;

import javax.swing.ImageIcon;

import com.lansmancai.lanflashget.util.ImageUtil;

/**
 * 正在下载的导航节点
 */
public class DownloadingNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.DOWNLOADING_NODE_IMAGE;
	}

	public String getText() {
		return "正在下载";
	}

}
