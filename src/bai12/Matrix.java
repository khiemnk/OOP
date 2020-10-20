/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author MyPC
 */
import java.util.*;
public class Matrix {
    private float[][] a;
    private int rows,cols;
    public Matrix() {
        this.a = new float[3][3];
    }

    public Matrix(int rows,int cols) {
        this.rows = rows;
        this.cols = cols;
        this.a = new float[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public float getA(int i,int j) {
        return a[i][j];
    }
    
    public Matrix add(Matrix m) throws Exception{
        if(this.rows != m.getRows()) 
            throw new Exception("So hang khong bang nhau");
        if(this.cols != m.getCols())
            throw new Exception("So cot khong bang nhau");
        Matrix result = new Matrix(this.rows,this.cols);
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++) result.a[i][j] = this.a[i][j] + m.getA(i, j);
        }
        return result;
    }
    
    public Matrix sub(Matrix m) throws Exception {
        if (m.getRows() != this.rows)
            throw new Exception("Số hàng không bằng nhau");
        if (m.getCols() != this.cols)
            throw new Exception("Số cột không bằng nhau");
        Matrix result = new Matrix(rows,cols);
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<this.cols;j++)
                result.a[i][j] = this.a[i][j] - m.getA(i,j);
        return result;
    }
    
    public Matrix mul(Matrix m) throws Exception{
        if(this.getCols() != m.getRows()) throw new Exception("So hang so cot khong hop le");
        Matrix result = new Matrix(this.rows,this.cols);
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<m.getCols();j++)
                for (int k=0;k<this.cols;k++)
                    result.a[i][j]+=this.a[i][k]*m.a[k][j];
        return result;
    }
    
    public Matrix neg() {
        Matrix result = new Matrix(this.rows,this.cols);
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<this.cols;j++)
                result.a[i][j] = -this.a[i][j];
        return result;
    }

    public Matrix transpose() {
        Matrix result = new Matrix(this.cols,this.rows);
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<this.cols;j++)
                result.a[j][i] = this.a[i][j];
        return result;
    }
    
    public void output(){
        for (int i=0;i<this.rows;i++) {
            for (int j = 0; j < this.cols; j++)
                System.out.print(this.a[i][j] + " ");
            System.out.println();
        }
    }

    public void input(Scanner scanner){
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<this.cols;j++)
                this.a[i][j] = scanner.nextFloat();
    }
}
