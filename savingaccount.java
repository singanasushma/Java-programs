/**
 * savingaccount
 */
public class savingaccount {
        String Accountnumber;
        String Holdername;
        double balance;
        savingaccount(String Accountnumber,String Holdername,double balance){
               this.Accountnumber=Accountnumber;
               this.Holdername=Holdername;
               this.balance=balance;
        }
    
        void displays(){
            System.out.println("Accountnumber:"+Accountnumber+"Holdername:"+Holdername+"balance:"+balance);
        }
        public class mainclass{
            public static void main(String[]args){
                savingaccount s1=new savingaccount("12345678","sushma",35000);
                s1.displays();
        }
    }
    }
