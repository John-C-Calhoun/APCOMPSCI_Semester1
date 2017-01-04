import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ExpressionSolver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("Please enter an equation");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		int i = 0;
		while(i < equation.size() && equation.get(i).equals("*"))
=======
		System.out.println("Please enter an equation: ");
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(kb.nextLine()));
		System.out.println(doEquation(equation));
	}
	public static String doEquation(equation)
	{
		while(int i = 0; i < equation.size(); i++)
>>>>>>> 1b803f833c82efe8220d085ead8868b324f330b8
		{
			if(i < equation.size() && equation.get(i).equals("*"))
			{
<<<<<<< HEAD
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
			}
			else
			{	
				i++;
			}
		}
		while(i < equation.size() && equation.get(i).equals("/"))
		{
			if(i < equation.size() && equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
			}
			else
			{	
				i++;
			}
		}
		while(i < equation.size() && equation.get(i).equals("+"))
		{
			if(i < equation.size() && equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
			}
			else
			{	
				i++;
			}
		}
		while(i < equation.size() && equation.get(i).equals("-"))
		{
			if(i < equation.size() && equation.get(i).equals("-"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
			}
			else
			{	
				i++;
			}
		}
		System.out.println(equation);
=======
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
>>>>>>> 1b803f833c82efe8220d085ead8868b324f330b8
	}
}