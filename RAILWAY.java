import java.io.*;
import java.util.Random;
public class RAILWAY
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String train[]={"12024","JANSHATABDI EXP","PATNA JN","PNBE","05:30","PATNA SAHEB","PNC","05:46","MOKAMEH JN","MKA","06:40","HATHIDAH JN","HTZ","06:48","LUCKEESARAI JN","LKR","07:12","JAMUI","JMU","07:38","JHAJHA","JAJ","08:21","JASIDIH JN","JSME","08:56","MADHUPUR JN","MDP","09:22","JAMTARA","JMT","09:52","CHITTARANJAN","CRJ","10:08","ASANSOL JN","ASN","10:43","DURGAPUR","DGR","11:17","HOWRAH JN","HWH","13:25"};
        int i,ch,nop=0,prn=0,prnu,k=0,m=0,sn=0,dn=0,rate=0,num=0;
        String pn[]=new String[10];
        String pa[]=new String[10];
        String ps[]=new String[10];
        int psn[]=new int[10];
        String User_id,password,cl="",doj="",dtn="",src="",ans,tm="",str="";
        System.out.println("                            Welcome To Railway reservation Terminal               ");
        System.out.println("User_id:-");
        User_id=in.readLine();
        System.out.println("Password:-");
        password=in.readLine();
        if(User_id.equals("admin")&&password.equals("admin"))
        {
             while(true)
            {
                System.out.println("1 Book Ticket");
                System.out.println("2 Enqiury Train");
                System.out.println("3 Print Ticket");
                System.out.println("4 Cancel ticket");
                System.out.println("5 Log out");
                System.out.println("Enter The Option Range (1-5)");
                ch=Integer.parseInt(in.readLine());
                Random ran = new Random();
                    if(ch==1)
                    {
                        prn=ran.nextInt(10)+456826;
                         m=ran.nextInt(10);
                        System.out.println("Enter The Journey Details");
                        System.out.println("Please Switch On Caps Lock Button ");
                        System.out.println("Enter The Date Of Journey  (DD-MM-YEAR) ");
                        doj=in.readLine();
                        System.out.println("Enter The Source Station");
                        src=in.readLine();
                        System.out.println("Enter The Destination Station");
                        dtn=in.readLine();
                        System.out.println("Enter The Class(SL,1AC,2AC,3AC)");
                        cl=in.readLine();
                        if(cl.equals("SL"))
                        {
                            rate=1000;
                        }
                        if(cl.equals("1AC"))
                        {
                            rate=3000;
                        }
                        if(cl.equals("2AC"))
                        {
                            rate=2500;
                        }
                        if(cl.equals("3AC"))
                        {
                            rate=2000;
                        }
                        
                        
                        System.out.println("Enter The Number of Passenger Excluding child(below<12)");
                        nop=Integer.parseInt(in.readLine());
                        num=rate*nop;
                        String a[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twentyone","twentytwo","twentythree","twentyfour","twentyfive","twentysix","twentyseven","twentyeight","twentynine","thirty","thirtyone","thirtytwo","thirtythree","thirtyfour","thirtyfive","thirtysix","thirtyseven","thirtyeight","thirtynine","fourty","fourtyone","fourtytwo","fourtythree","fourtyfour","fourtyfive","fourtysix","fourtyseven","fourtyeight","fourtynine","fifty","fiftyone","fiftytwo","fiftythree","fiftyfour","fiftyfive","fiftysix","fiftyseven","fiftyeight","fiftynine","sixty","sixtyone","sixtytwo","sixtythree","sixtyfour","sixtyfive","sixtysix","sixtyseven","sixtyeight","sixtynine","seventy","seventyone","seventytwo","seventythree","seventyfour","seventyfive","seventysix","seventyseven","seventyeight","seventynine","eighty","eightyone","eightytwo","eightythree","eightyfour","eightyfive","eightysix","eightyseven","eightyeight","eightynine","ninty","nintyone","nintytwo","nintythree","nintyfour","nintyfive","nintysix","nintyseven","nintyeight","nintynine"};
                        int l,p1,p2,p3,p;
                        String name=num+"";
                        l=name.length();
                        if(l==4||l==5)
                        {
                        p1=num/1000;
                        for(i=0;i<100;i++)
                        {
                            if(i==p1&&p1!=0)
                            {
                                str=str+a[i]+"  thousand";
                            }
                        }
                        p2=(num%1000)/100;
                        for(i=0;i<100;i++)
                        {
                            if(i==p2&&p2!=0)
                            {
                                str=str+"  "+a[i]+"  hundred";
                            }
                        }
                        p3=(num%1000)%100;
                        for(i=0;i<100;i++)
                        {
                            if(i==p3&&p3!=0)
                            {
                                str=str+"  and  "+a[i]+"  only";
                            }
                        }
                        }
                        if(l==6||l==7)
                        {
                        p=num/100000;
                        for(i=0;i<100;i++)
                        {
                            if(i==p&&p!=0)
                            {
                                str=str+a[i]+" lac";
                            }
                        }
                        p1=num%100000;
                        p1=p1/1000;
                        for(i=0;i<100;i++)
                        {
                            if(i==p1&&p1!=0)
                            {
                                str=str+" "+a[i]+"  thousand";
                            }
                        }
                        p2=(num%1000)/100;
                        for(i=0;i<100;i++)
                        {
                            if(i==p2&&p2!=0)
                            {
                                str=str+"  "+a[i]+"  hundred";
                            }
                        }
                        p3=(num%1000)%100;
                        for(i=0;i<100;i++)
                        {
                            if(i==p3&&p3!=0)
                            {
                                str=str+"  and  "+a[i];
                            }
                        }

                        }
                        
                        for(i=0;i<nop;i++)
                        {
                            System.out.println("Enter The "+(i+1)+" Passenger Name");
                            pn[i]=in.readLine();
                            System.out.println("Enter The "+(i+1)+" Passenger Age");
                            pa[i]=in.readLine();
                            System.out.println("Enter The "+(i+1)+" Passenger Sex");
                            ps[i]=in.readLine();
                            psn[i]=ran.nextInt(6) + 41;
                            
                        }
                        for(i=0;i<44;i++)
                        {
                            if(train[i].equals(src))
                            {
                                src=train[i-1];
                                tm=train[i+1];
                            }
                            if(train[i].equals(dtn))
                            {
                                dtn=train[i-1];
                            }
                        }
                        System.out.println("                  Successfully Booked Ticket                                                      ");
                        System.out.println("PNR : "+prn);
                        System.out.println("Train Name :"+train[1]);
                        System.out.println("Train Number: "+train[0]);
                        System.out.println("Boarding Station : "+src+"                   "+"Destination Station : "+dtn);
                        System.out.println("Date of Journey :"+doj);
                        System.out.println("Arrival Time: "+tm);
                        
                        System.out.println("Coach :"+cl+""+m);
                        System.out.println("Sno "+'\t'+"Name                     "+'\t'+"Age "+'\t'+"Sex"+'\t'+"Seat No");
                        for(i=0;i<nop;i++)
                        {
                             k=i+1;
                            System.out.println((k)+" "+'\t'+pn[i]+"               "+'\t'+pa[i]+'\t'+ps[i]+'\t'+psn[i]);
                        }
                        System.out.println("Amount in word:- "+str+" only");
                        
                    }
                    if(ch==2)
                    {
                        System.out.println("                            E-Ticket Query Terminal                                                   ");
                        System.out.println("Enter The Date Journey:");
                        doj=in.readLine();
                        System.out.println("Enter The Source station :");
                        src=in.readLine();
                        System.out.println("Enter The Destination Station :");
                        dtn=in.readLine();
                        for(i=0;i<44;i++)
                        {
                            if(train[i].equals(src))
                            {
                                sn=1;
                                tm=train[i+1];
                            }
                            if(train[i].equals(dtn))
                            {
                                dn=1;
                            }
                        }
                        if(dn==1&&sn==1)
                        {
                            System.out.println("                     Your Search Results                   ");
                            System.out.println("Journey Date :"+doj);
                            System.out.println("Arrival time :"+tm);
                            System.out.println("Train Number: "+train[0]);
                            System.out.println("Train Name: "+train[1]);
                            System.out.println("Source Station: "+src);
                            System.out.println("Destination Station: "+dtn);
                           
                        }
                        
                        else
                        {
                            System.out.println("Sorry No Train Matched Of Your Choice ");
                           
                        }
                    }
                    if(ch==3)
                    {
                        k=0;
                        System.out.println("                          E-Tecket Print Terminal                                                         ");
                        System.out.println("Enter The PNR: ");
                        prnu=Integer.parseInt(in.readLine());
                        if(prnu==prn)
                        {
                            System.out.println("                            E-Ticket Details                                               ");
                        System.out.println("PNR : "+prn);
                        System.out.println("Train Name :"+train[1]);
                        System.out.println("Train Number: "+train[0]);
                        System.out.println("Boarding Station : "+src+"                   "+"Destination Station : "+dtn);
                        System.out.println("Date of Journey :"+doj);
                        System.out.println("Arrival Time: "+tm);
                        System.out.println("Coach :"+cl+""+m);
                        System.out.println("Sno "+'\t'+"Name                     "+'\t'+"Age "+'\t'+"Sex"+'\t'+"Seat No");
                        for(i=0;i<nop;i++)
                        {
                             k=i+1;
                            System.out.println((k)+" "+'\t'+pn[i]+"               "+'\t'+pa[i]+'\t'+ps[i]+'\t'+psn[i]);
                        }
                        System.out.println("Amount in word:- "+str+" only");
                        
                        }
                        
                    }
                    if(ch==4)
                    {
                        System.out.println("                      E-Ticket Cancel  Terminal                                           ");
                        System.out.println("Do You Sure Want To Cancel E-Ticket ?Y or N");
                        ans=in.readLine();
                        if(ans.equals("Y"))
                        {
                            System.out.println("Enter The PRN: ");
                           
                            prnu=Integer.parseInt(in.readLine());
                            if(prnu==prn)
                            {
                                for(i=0;i<nop;i++)
                                { 
                                    pn[i]="";
                                    pa[i]="";
                                    ps[i]="";
                                    psn[i]=0;
                                    prn=0;    
                                }
                                System.out.println("Your Ticket Has Been Successfully cancel");
                            }
                        }
                
                        else
                        {
                            System.out.println("NO Record Found");
                        }

                        if(ans.equals("N"))
                        {
                            continue;
                        }

                    }
                    if(ch==5)
                    {
                        System.out.println("Logging Out Successfully");
                        System.out.println("Thank You ");
                        break;
                    }
                }
            }
        }
    }
    


        
        
