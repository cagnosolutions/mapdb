package doc;

import org.mapdb.DB;
import org.mapdb.DBMaker;


public class durability_transaction_disable {

    public static void main(String[] args) {
        //a
        DB db = DBMaker
                .memoryDB()
                .transactionDisable()
                .closeOnJvmShutdown()
                .make();
        //z
    }
}
