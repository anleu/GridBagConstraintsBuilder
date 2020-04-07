package com.ztz.gridbagconstraintsbuilder;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagContraintsBuilder {

	private int    xPos;
	private int    yPos;
	private int    width;
	private int    height;
	private int    weightX;
	private int    weightY;
	private int    anchor;
	private int    fill;
	private Insets insets;
	private int    paddingX;
	private int    paddingY;

	public GridBagContraintsBuilder() {
		resetToDefault();
	}

	private void resetToDefault() {
		xPos = 0;
		yPos = 0;
		width = 1;
		height = 1;
		weightX = 0;
		weightY = 0;
		anchor = GridBagConstraints.WEST;
		fill = GridBagConstraints.NONE;
		insets = new Insets(0, 0, 0, 0);
		paddingX = 0;
		paddingY = 0;
	}

	public GridBagContraintsBuilder x(int xPos) {
		this.xPos = xPos;
		return this;
	}

	public GridBagContraintsBuilder y(int yPos) {
		this.yPos = yPos;
		return this;
	}

	public GridBagContraintsBuilder width(int width) {
		this.width = width;
		return this;
	}

	public GridBagContraintsBuilder height(int height) {
		this.height = height;
		return this;
	}

	public GridBagContraintsBuilder weightX(int weightX) {
		this.weightX = weightX;
		return this;
	}

	public GridBagContraintsBuilder weightY(int weightY) {
		this.weightY = weightY;
		return this;
	}

	public GridBagContraintsBuilder anchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	public GridBagContraintsBuilder fill(int fill) {
		this.fill = fill;
		return this;
	}

	public GridBagContraintsBuilder insets(Insets insets) {
		this.insets = insets;
		return this;
	}

	public GridBagContraintsBuilder unifiedInsets(int inset) {
		this.insets = new Insets(inset, inset, inset, inset);
		return this;
	}

	public GridBagContraintsBuilder growHorizontal() {
		this.weightX = 1;
		this.fill = GridBagConstraints.HORIZONTAL;
		return this;
	}

	public GridBagContraintsBuilder growVertical() {
		this.weightY = 1;
		this.fill = GridBagConstraints.VERTICAL;
		return this;
	}

	public GridBagContraintsBuilder growBoth() {
		this.weightX = 1;
		this.weightY = 1;
		this.fill = GridBagConstraints.BOTH;
		return this;
	}

	public GridBagContraintsBuilder rowRemainder() {
		this.width = GridBagConstraints.REMAINDER;
		return this;
	}

	public GridBagContraintsBuilder colRemainder() {
		this.height = GridBagConstraints.REMAINDER;
		return this;
	}



	public GridBagConstraints build() {
		GridBagConstraints gridBagConstraints = new GridBagConstraints(xPos, yPos, width, height, weightX, weightY, anchor, fill, insets, paddingX, paddingY);
		resetToDefault();
		return gridBagConstraints;
	}
}
