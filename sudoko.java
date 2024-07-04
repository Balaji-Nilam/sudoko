import java.util.Scanner;
class sudoko
{
    
    public int sudo[][]=new int[100][100];
    void allocate()
    {
        for(int i=1;i<10;i++)
            {
                for(int j=1;j<10;j++)
                {
                    sudo[i][j]=0;
                }
            }
    }
     int continue1()
        {
            int cnt=0;
            for(int i=1;i<10;i++)
            {
                for(int j=1;j<10;j++)
                {
                    if(sudo[i][j]==0)
                    {
                        cnt+=1;
                    }
                }
            }
            return cnt;
        }
    void display()
    {
        
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                System.out.print(sudo[i][j]+ "  ");
            }
            System.out.println();
        }
    }
 
    void row_col_grid_check(int row,int col, int input)
    {
            int count=0;
            for(int x=0;x<10;x++)
            {
                if(sudo[row][x]==input)
                {
                    count=count+1;
                }
            } 
            for(int y=0;y<10;y++)  
            {
                if(sudo[y][col]==input)
                {
                    count=count+1;
                }
                
            }
            if (row==1 || row==2 || row==3)
            {
                if(col==1 || col==2 || col==3)
                {
                    for(int a1=1;a1<4;a1++)
                    {
                        for(int b1=1;b1<4;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
       
                if (row==1 || row==2 || row==3)
            {
                if(col==4 || col==5 || col==6)
                {
                    for(int a1=1;a1<4;a1++)
                    {
                        for(int b1=4;b1<7;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
        
            if (row==1 || row==2 || row==3)
            {
                if(col==7 || col==8 || col==9)
                {
                    for(int a1=1;a1<4;a1++)
                    {
                        for(int b1=7;b1<10;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
       
            if (row==4 || row==5 || row==6)
            {
                if(col==1 || col==2 || col==3)
                {
                    for(int a1=4;a1<7;a1++)
                    {
                        for(int b1=1;b1<4;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
        
            if (row==4 || row==5 || row==6)
            {
                if(col==4 || col==5 || col==6)
                {
                    for(int a1=4;a1<7;a1++)
                    {
                        for(int b1=4;b1<7;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
        
            if (row==4 || row==5 || row==6)
            {
                if(col==7 || col==8 || col==9)
                {
                    for(int a1=4;a1<7;a1++)
                    {
                        for(int b1=7;b1<10;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
       
            if (row==7 || row==8|| row==9)
            {
                if(col==1 || col==2 || col==3)
                {
                    for(int a1=7;a1<10;a1++)
                    {
                        for(int b1=1;b1<4;b1++)
                        {
                            if(sudo[a1][b1]==input) 
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
        
            if (row==7 || row==8 || row==9)
            {
                if(col==4 || col==5 || col==6)
                {
                    for(int a1=7;a1<10;a1++)
                    {
                        for(int b1=4;b1<7;b1++)
                        {
                            if(sudo[a1][b1]==input) 
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }
        
            if (row==7 || row==8 || row==9)
            {
                if(col==7 || col==8 || col==9)
                {
                    for(int a1=7;a1<10;a1++)
                    {
                        for(int b1=7;b1<10;b1++)
                        {
                            if(sudo[a1][b1]==input)
                            {
                                count=count+1;
                            }
                        }
                    }           
                }
            }        
        if(count==0)
            {
                sudo[row][col]=input;
            } 
        else
            {
               System.out.println("Can\'t place"+input+" at this loction");
            }   
    }
}
class input12
   {
        Scanner c=new Scanner(System.in);
        sudoko a123=new sudoko();
        void abcd()
        {
            int cont=a123.continue1();
            while(cont!=0)
            {
                System.out.println("Enter row index :");
                int roww=c.nextInt();
                System.out.println("Enter col index :");
                int coll=c.nextInt();
                System.out.println("Enter Number to insert :");
                int inputt=c.nextInt();
                if((roww>9) || (roww < 1) || (coll>9) || (coll<1) || (inputt<1) || (inputt>9))
                {
                    System.out.println("Please give  valid inputs:");
                    abcd();
                }
                else
                {
                    a123.row_col_grid_check(roww,coll,inputt);
                    a123.display();
                }
                cont=a123.continue1();
            }
           System.out.println("\n\n\t----GAME OVER----\n\n"); 
        }
    } 
class Main4
{
    public static void main(String args[])
    {
        sudoko a=new sudoko();
        input12 b1=new input12();
        a.allocate();
        a.display();
        b1.abcd();   
    }
}
 
 
 
