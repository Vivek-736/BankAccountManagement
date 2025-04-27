package eu.rudiment.bankaccountprogram

fun main(){
    val vivekBankAccount = BankAccount("Vivek", 1000000.00)
    println(vivekBankAccount.accountHolder)
    vivekBankAccount.deposit(2000.00)
    vivekBankAccount.withdraw(22000.00)
    vivekBankAccount.deposit(75000.00)
    vivekBankAccount.deposit(67000.60)
    vivekBankAccount.withdraw(678900.50)
    vivekBankAccount.deposit(400.70)
    vivekBankAccount.withdraw(420000.90)
    vivekBankAccount.displayTransactionHistory()
    vivekBankAccount.accBalance()

    println()
}