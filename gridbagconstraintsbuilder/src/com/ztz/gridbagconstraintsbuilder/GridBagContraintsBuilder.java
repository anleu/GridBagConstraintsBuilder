package com.ztz.gridbagconstraintsbuilder;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagContraintsBuilder {

	private int    xPos;
	private int    yPos;
	private int    width;
	private int    height;
	private double weightX;
	private double weightY;
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

	public GridBagContraintsBuilder weightX(double weightX) {
		this.weightX = weightX;
		return this;
	}

	public GridBagContraintsBuilder weightY(double weightY) {
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

	public GridBagContraintsBuilder insets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}

	/**
	 * Add the same inset at top, left, bottom and right
	 */
	public GridBagContraintsBuilder insets(int inset) {
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

	public GridBagContraintsBuilder west() {
		this.anchor = GridBagConstraints.WEST;
		return this;
	}

	public GridBagContraintsBuilder east() {
		this.anchor = GridBagConstraints.EAST;
		return this;
	}

	public GridBagContraintsBuilder north() {
		this.anchor = GridBagConstraints.NORTH;
		return this;
	}

	public GridBagContraintsBuilder northEast() {
		this.anchor = GridBagConstraints.NORTHEAST;
		return this;
	}

	public GridBagContraintsBuilder northWest() {
		this.anchor = GridBagConstraints.NORTHWEST;
		return this;
	}

	public GridBagContraintsBuilder center() {
		this.anchor = GridBagConstraints.CENTER;
		return this;
	}

	public GridBagContraintsBuilder south() {
		this.anchor = GridBagConstraints.SOUTH;
		return this;
	}

	public GridBagContraintsBuilder southEast() {
		this.anchor = GridBagConstraints.SOUTHEAST;
		return this;
	}

	public GridBagContraintsBuilder southWest() {
		this.anchor = GridBagConstraints.SOUTHWEST;
		return this;
	}

	public GridBagContraintsBuilder lineStart() {
		this.anchor = GridBagConstraints.LINE_START;
		return this;
	}

	public GridBagContraintsBuilder lineEnd() {
		this.anchor = GridBagConstraints.LINE_END;
		return this;
	}

	public GridBagContraintsBuilder firstLineStart() {
		this.anchor = GridBagConstraints.FIRST_LINE_START;
		return this;
	}

	public GridBagContraintsBuilder firstLineEnd() {
		this.anchor = GridBagConstraints.FIRST_LINE_END;
		return this;
	}

	public GridBagContraintsBuilder lastLineStart() {
		this.anchor = GridBagConstraints.LAST_LINE_START;
		return this;
	}

	public GridBagContraintsBuilder lastLineEnd() {
		this.anchor = GridBagConstraints.LAST_LINE_END;
		return this;
	}

	public GridBagContraintsBuilder pageStart() {
		this.anchor = GridBagConstraints.PAGE_START;
		return this;
	}

	public GridBagContraintsBuilder pageEnd() {
		this.anchor = GridBagConstraints.PAGE_END;
		return this;
	}

	public GridBagConstraints buildAndReset() {
		GridBagConstraints gridBagConstraints = new GridBagConstraints(xPos, yPos, width, height, weightX, weightY, anchor, fill, insets, paddingX, paddingY);
		resetToDefault();
		return gridBagConstraints;
	}
}
