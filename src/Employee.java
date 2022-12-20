public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear ){
        this.name = name;
        this.salary = salary;
        this.workHours=workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (this.salary<1000){
            return 0;
        }else {
            return (this.salary/100)*3;
        }
    }
    public double bonus(){
        if (this.workHours>40){
           return  (workHours-40)*30;
        }else {
            return 0;
        }
    }
    public double raiseSalary(){
        if (2021-this.hireYear<10){
            return (this.salary*5)/100;
        } else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return  (this.salary*10)/100;
        }else {
            return  (this.salary*15)/100;
        }
    }
    public void Print(){
        System.out.println(" Çalışanın Adı : " + this.name +"\n Çalışanın maaşı : "
                + this.salary + "\n Çalışanın Haftalık Çalışması : " +
                this.workHours +"\n Çalışanın İşe Başlama Yılı : " + this.hireYear +
                "\n Vergisi : " + this.tax() + "\n Bonuslar : " + this.bonus() +
                "\n Maaş Artışı : " + (this.raiseSalary())+
                "\n Vergiler ve Bonuslarla ile Birlikte Maaş : " + (this.salary+this.bonus()-this.tax())+
                "\n Toplam maaş : " + (this.salary+this.raiseSalary())+
                "\n -------------------------------");
    }
}
