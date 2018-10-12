 package objectorientedprogram;

public class BankAccount {
private double balance;
private int account;
private double interest;
public BankAccount(){
balance = 7.50;
account= 123456;
interest=55.5;
}
public BankAccount(double balance, double account, double interest){
}
public void deposit(){
balance= balance+1;
}
public void withdraw(){
balance= balance - 1;
}
public void interest(){
interest = balance + 4.12;
}
public void financialcharge(double financialcharge){
balance= balance - 4.5;
}
}