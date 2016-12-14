import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(kb.nextLine()));
		System.out.println(doEquation(equation));
	}
	public static String doEquation(equation)
	{
		while(int i = 0; i < equation.size(); i++)
		{
			if(equation.get(i) == "*" || equation.get(i) == "/")
			{
				if(equation.get(i) == "*")
				{
					equation.get(i) = equation.get(i-1) * equation.get(i+1);
				}
				else
				{
					equation.get(i) = equation.get(i-1) / equation.get(i+1);
				}
				equation.remove(i-1);
				equation.remove(i);
			}
		}
		equation.add(1);
		while(int j = 0; j < equation.size(); j++)
		{
			if(equation.get(i) == "+" || equation.get(i) == "-")
			{
				if(equation.get(i) == "+")
				{
					equation.get(i) = equation.get(i-1) + equation.get(i+1);
				}
				else
				{
					equation.get(i) = equation.get(i-1) - equation.get(i+1);
				}
				equation.remove(i-1);
				equation.remove(i);
			}
		}
		equation.add(1);
		return equation;
	}
}