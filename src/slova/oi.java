package slova;

import java.io.*;


    public class oi
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int gl = 0;
            System.out.println("Пишите:");

            String str = in.readLine();
            for(int i=0; i<str.length(); i++)
            {
                if(str.charAt(i)=='.' || str.charAt(i)==';' || str.charAt(i)=='-' || str.charAt(i)==':' || str.charAt(i)==',')
                    gl++;
                else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='Y')
                    gl++;
                else if(str.charAt(i)!=' ' &&( ((int)str.charAt(i)>64 && (int)str.charAt(i)<91) || ((int)str.charAt(i)>96 && (int)str.charAt(i)<123)))
                    sogl++;
            }
            System.out.println("Число гласных="+gl+" процент гласных="+gl*100/(gl+sogl)+"%");
            System.out.println("Число согласных="+sogl+" процент согласных="+sogl*100/(gl+sogl)+"%");
        }

    }


      //  int blockCount = "1215 544 965".split(" ").length;
     //out.println("abc".length()); подчет символов. Выведеет 3
     // out.println(s.split(" ").length()); подсчет слов

