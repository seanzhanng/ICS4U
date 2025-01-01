/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazegenerator;

/**
 *
 * @author snyou
 */
public class Grid {
    private Cell[][] grid;
    public int width, height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y] = new Cell(x, y);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height; // return true as long as in bounds
    }
}