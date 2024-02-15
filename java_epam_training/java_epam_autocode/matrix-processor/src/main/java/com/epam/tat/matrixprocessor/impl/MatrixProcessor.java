package com.epam.tat.matrixprocessor.impl;

import com.epam.tat.matrixprocessor.IMatrixProcessor;
import com.epam.tat.matrixprocessor.exception.MatrixProcessorException;


import static java.lang.Double.*;

public class MatrixProcessor implements IMatrixProcessor {

	@Override
	public double[][] transpose(double[][] matrix) {
		if (matrix == null) throw new MatrixProcessorException();
		if (matrix.length == 0) throw new MatrixProcessorException();


		int a = matrix.length;
		int b = matrix[0].length;
		double[][] mat = new double[b][a];

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				mat[i][j] = matrix[j][i];
			}
		}
			return mat;
	}

	@Override
	public double[][] turnClockwise(double[][] matrix) {
		if (matrix == null) {
			throw new MatrixProcessorException();
		}

		if (matrix.length == 0) {
			throw new MatrixProcessorException();
		}

		int a = matrix.length;
		int b = matrix[0].length;
		double[][] mat = new double[b][a];


		for (int i = 0; i < b; i++) {
			int ch = a;
			for (int j = 0; j < a; j++) {
				--ch;
				mat[i][j] = matrix[ch][i];
			}
		}
		return mat;
	}

	@Override
	public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
		if (firstMatrix == null || secondMatrix == null) {
			throw new MatrixProcessorException();
		}

		if (firstMatrix.length == 0 || secondMatrix.length == 0) {
			throw new MatrixProcessorException();
		}

		if (firstMatrix[0].length != secondMatrix.length){
			throw new MatrixProcessorException();
		}


		int a = firstMatrix.length;
		int b = secondMatrix[0].length;

		double[][]result = new double[a][b];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				for(int k=0;k<secondMatrix.length;k++) {


					double sum = firstMatrix[i][k]*secondMatrix[k][j];

					double value = Math.round(sum * 1000.0) / 1000.0;

					result[i][j] += value;



				}
			}
		}
		return result;
	}


	@Override
	public double[][] getInverseMatrix(double[][] matrix) {
		if (matrix == null) {
			throw new MatrixProcessorException();
		}

		if (matrix.length == 0) {
			throw new MatrixProcessorException();
		}

		if (matrix.length != matrix[0].length) {
			throw new MatrixProcessorException();
		}

		double temp;
		int size = matrix.length;

		double[][] massiv = new double[size][size];


		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				massiv[i][j] = 0f;

				if (i == j)
					massiv[i][j] = 1f;
			}

		for (int k = 0; k < size; k++) {
			temp = matrix[k][k];

			for (int j = 0; j < size; j++) {
				matrix[k][j] /= temp;
				massiv[k][j] /= temp;
			}

			for (int i = k + 1; i < size; i++) {
				temp = matrix[i][k];

				for (int j = 0; j < size; j++) {
					matrix[i][j] -= matrix[k][j] * temp;
					massiv[i][j] -= massiv[k][j] * temp;
				}
			}
		}

		for (int k = size - 1; k > 0; k--) {
			for (int i = k - 1; i >= 0; i--) {
				temp = matrix[i][k];

				for (int j = 0; j < size; j++) {
					matrix[i][j] -= matrix[k][j] * temp;
					massiv[i][j] -= massiv[k][j] * temp;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				double result = massiv[i][j];

				double scale = Math.pow(10.0, 3);
				result = Math.round(result * scale) / scale;
				matrix[i][j] = result;
	        }
	   }
		return matrix;
	}

	@Override
	public double getMatrixDeterminant(double[][] matrix) {
		if (matrix == null) {
			throw new MatrixProcessorException();
		}

		if (matrix.length == 0) {
			throw new MatrixProcessorException();
		}

		if (matrix.length != matrix[0].length) {
			throw new MatrixProcessorException();
		}

		int n = matrix.length;
		if(n == 1) return matrix[0][0];
		double ans = 0;
		double[][] prommass = new double[n-1][n-1];
		int l = 1;
		for(int i = 0; i < n; ++i){

			int x = 0;
			int y = 0;
			for(int j = 1; j < n; ++j){
				for(int k = 0; k < n; ++k){
					if(i == k) continue;
					prommass[x][y] = matrix[j][k];
					++y;
					if(y == n - 1){
						y = 0;
						++x;
					}
				}
			}
			ans += l * matrix[0][i] * getMatrixDeterminant(prommass);
			l *= (-1);
		}
		return ans;
	}

}
