#include <stdio.h>
#include <time.h>
#include <string.h>
#include <conio.h>

#define LEN 150
int n=1;

struct student{
    char usn[10];
    int flag;
    char time_in[40];
    char time_out[40];
};

struct student stud[30];

int details()
{
    
    
    int res;
    int count=0;
    int count1=0;
    int j;
    int temp;
    time_t t;
    time(&t);
    char temp_usn[10];
    printf("\n Scan USN: ");
    scanf("%s",temp_usn);

    for (j = 0; j < 30; j++)
    {
        res=strcmp(temp_usn,stud[j].usn);
        if(res==0)
        {
            if(stud[j].flag==0)
            {
                res=1;
                break;
            }
            else
            {
                temp=j;
                break;
            } 
        }
    }

    

    switch(res)
    {
        case 0: printf("\n USN FOUND");
                printf("\n Log out date and time is : %s",ctime(&t));
                strcpy(stud[temp].time_out,ctime(&t));
                stud[temp].flag=0;
                printf("\n +---------------------------------------------------------+");
                printf("\n |\t \t DATABASE UPDATED SUCCESSFULLY \t \t   |");
                printf("\n +---------------------------------------------------------+");
                printf("\n \t USN \t \t");
                printf("\t %s ",stud[temp].usn);
                printf("\n \t Time IN \t");
                printf("\t %s ",stud[temp].time_in);
                printf("\t Time OUT \t");
                printf("\t %s ",stud[temp].time_out);
                
                break;
            
        case 1: n++;
                printf("\n USN SCANNED");
                printf("\n Log in date and time is : %s",ctime(&t));
                strcpy(stud[n].time_in,ctime(&t));
                strcpy(stud[n].usn,temp_usn);
                stud[n].flag=1;
                count1++;
                break;        
    } 

    
    
    
}

void main()
{

    while(1)
    {
        details();
    }

}
