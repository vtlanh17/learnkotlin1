fun main(args: Array<String>) {
    for (i in 1..9){
        for (j in 1..9 ){
            if (j==1||j==9||i==j){
                print("$i$j")
            }
            print("\t")
        }
        println(" ")    }
}