
import java.io.*;
import java.util.Arrays;


public class TwoDArrays
{
	
	public static void main(String[] args)
	{
		int[] list = new int[50];
		int[][] table = new int[3][5];

		table[0][4] = 7;
		table[1][2] = 9;

		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table[0].length; j++)
			{
				System.out.printf("%-5d", table[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		int[][] multTable = new int[10][12];

		for (int row = 0; row < multTable.length; row++)
		{
			for (int col = 0; col < multTable[row].length; col++)
			{
				multTable[row][col] = row * col;
			}
		}

		for (int i = 0; i < multTable.length; i++)
		{
			for (int j = 0; j < multTable[0].length; j++)
			{
				System.out.printf("%-5d", multTable[i][j]);
			}
			System.out.println();
		}
	}

}