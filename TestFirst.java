import java.util.Scanner;

public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Объявление переменных
		int schet = 0;		
		boolean proverka;
		int pont = 1;
		String FIO = "";
		int age = 0;
		String group = "";

		// Ввод ФИО
		System.out.println("Заполните анкету\nУкажите ваше ФИО:");
		FIO = in.nextLine(); 

		// Ввод группы
		System.out.println("Укажите вашу группу:");
		group = in.nextLine(); 

		// Ввод возраста		
		System.out.println("Укажите ваш возраст");
		age = in.nextInt();
		
		// первый вопрос
		System.out.println("Крым - это Россия? 1 - Да, 2 - Нет.");
		int otvet = in.nextInt(); 
		if (otvet == 1)
		{
			System.out.println("Ответ верный!");
			schet++;
		}
		else if (otvet == 2)
		{
			System.out.println("Ответ неправильный!");
		}
		
		// второй вопрос
		System.out.println("Столица Беларуси это? 1 - Минск, 2 - Вашингтон.");
		otvet = in.nextInt(); 
		if (otvet == 1)
		{
			System.out.println("Ответ верный!");
			schet++;
		}
		else if (otvet == 2)
		{
			System.out.println("Ответ неправильный!");
		}
		
		// третий вопрос
		System.out.println("Сколько будет 2+2*2? 1 - Шесть, 2 - Восемь.");
		otvet = in.nextInt(); 
		if (otvet == 1)
		{
			System.out.println("Ответ верный!");
			schet++;
		}
		else if (otvet == 2)
		{
			System.out.println("Ответ неправильный!");
		}
		
		// четвертый вопрос
		System.out.println("В каком году был основан Санкт-Петербург? 1 - 1703 год, 2 - 228 год.");
		otvet = in.nextInt(); 
		if (otvet == 1)
		{
			System.out.println("Ответ верный!");
			schet++;
		}
		else if (otvet == 2)
		{
			System.out.println("Ответ неправильный!");
		}
		
		// пятый вопрос
		System.out.println("В каком месяце 28 дней? 1 - В любом, 2 - В феврале.");
		otvet = in.nextInt(); 
		if (otvet == 1)
		{
			System.out.println("Ответ верный!");
			schet++;
		}
		else if (otvet == 2)
		{
			System.out.println("Ответ неправильный!");
		}
		
		// Итоговый вывод с оценкой
		System.out.println("Студент " + FIO + " группы " + group + ",");
		switch(schet)
		{
			case 1:
			System.out.print("Ваша оценка составила 1 балл, вы тупой!");
			break;
			case 2:
			System.out.print("Ваша оценка составила 2 балла, вы глупый!");
			break;
			case 3:
			System.out.print("Ваша оценка составила 3 балла, вы нормальный!");
			break;
			case 4:
			System.out.print("Ваша оценка составила 4 балла, вы хороший!");
			break;
			case 5:
			System.out.print("Ваша оценка составила 5 баллов, вы мегамозг!");
			break;
			default:
			System.out.print("Вы можете вообще ходить?");
			break;
		}
	}
}