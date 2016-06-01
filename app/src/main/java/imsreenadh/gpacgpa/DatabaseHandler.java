package imsreenadh.gpacgpa;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sreenadh TC on 25-05-2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "users_db";

    // Users table name
    private static final String TABLE_CONTACTS = "users";

    // User Table Columns names
    private static final String KEY_ID = "_id";
    private static final String KEY_NAME = "name";
    private static final String KEY_REG_NO = "regnum";
    private static final String KEY_1101 = "1101", KEY_1102 = "1102",
            KEY_1103 = "1103", KEY_1104 = "1104",
            KEY_1105 = "1105", KEY_1106 = "1106",
            KEY_1107 = "1107", KEY_1108 = "1108",
            KEY_1109 = "1109", KEY_11L1 = "11L1",
            KEY_11L2 = "11L2", KEY_11L3 = "11L3";

    private static final String KEY_1301 = "1501", KEY_1302 = "1302",
            KEY_1303 = "1303", KEY_1304 = "1304",
            KEY_1305 = "1305", KEY_1306 = "1306",
            KEY_13L1 = "13L1", KEY_13L2 = "13L2";

    private static final String KEY_1401 = "1401", KEY_1402 = "1402",
            KEY_1403 = "1403", KEY_1404 = "1404",
            KEY_1405 = "1405", KEY_1406 = "1406",
            KEY_14L1 = "14L1", KEY_14L2 = "14L2";

    private static final String KEY_1501 = "1501", KEY_1502 = "1502",
            KEY_1503 = "1503", KEY_1504 = "1504",
            KEY_1505 = "1505", KEY_1506 = "1506",
            KEY_15L1 = "15L1", KEY_15L2 = "15L2";

    private static final String KEY_1601 = "1601", KEY_1602 = "1602",
            KEY_1603 = "1603", KEY_1604 = "1604",
            KEY_1605 = "1605", KEY_1606 = "1606",
            KEY_16L1 = "16L1", KEY_16L2 = "16L2";

    private static final String KEY_1701 = "1701", KEY_1702 = "1702",
            KEY_1703 = "1703", KEY_1704 = "1704",
            KEY_1705 = "1705", KEY_17L1 = "17L1",
            KEY_17L2 = "17L2", KEY_17L3 = "17L3", KEY_17L4 = "17L4";

    private static final String KEY_1801 = "1801", KEY_1802 = "1802",
            KEY_1803 = "1803", KEY_1804 = "1804",
            KEY_18L1 = "18L1", KEY_18L2 = "18L2";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // Adding a new user using Reg Num
    public void addUser(User user) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, user.get_name()); // Update name
        values.put(KEY_REG_NO, user.get_regnum()); // Update reg num
    }

    /*
    // Getting single user
    public User getUser(int id) {
    }

    // Getting All Users
    public List<User> getAllUsers() {
    }

    // Getting contacts Count
    public int getUserCount() {
    }

    // Updating single user
    public int updateUser(User user) {
    }

    // Deleting single user
    public void deleteUser(User user) {
    }

    */
    
    // Insert First year details
    public void insertFirstYear(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpFirstYear = user.get_firstYear();

        values.put(KEY_1101, String.valueOf(tmpFirstYear[0]));
        values.put(KEY_1102, String.valueOf(tmpFirstYear[1]));
        values.put(KEY_1103, String.valueOf(tmpFirstYear[2]));
        values.put(KEY_1104, String.valueOf(tmpFirstYear[3]));
        values.put(KEY_1105, String.valueOf(tmpFirstYear[4]));
        values.put(KEY_1106, String.valueOf(tmpFirstYear[5]));
        values.put(KEY_1107, String.valueOf(tmpFirstYear[6]));
        values.put(KEY_1108, String.valueOf(tmpFirstYear[7]));
        values.put(KEY_1109, String.valueOf(tmpFirstYear[8]));
        values.put(KEY_11L1, String.valueOf(tmpFirstYear[9]));
        values.put(KEY_11L2, String.valueOf(tmpFirstYear[10]));
        values.put(KEY_11L3, String.valueOf(tmpFirstYear[11]));
        System.out.println("DatabaseHandler : First Year Insertion successful");
    }

    public void insertThirdSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpThird = user.get_thirdSem();

        values.put(KEY_1301, String.valueOf(tmpThird[0]));
        values.put(KEY_1302, String.valueOf(tmpThird[1]));
        values.put(KEY_1303, String.valueOf(tmpThird[2]));
        values.put(KEY_1304, String.valueOf(tmpThird[3]));
        values.put(KEY_1305, String.valueOf(tmpThird[4]));
        values.put(KEY_1306, String.valueOf(tmpThird[5]));
        values.put(KEY_13L1, String.valueOf(tmpThird[6]));
        values.put(KEY_13L2, String.valueOf(tmpThird[7]));
        System.out.println("DatabaseHandler : Third Sem Insertion successfull");
    }

    public void insertForthSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpForth = user.get_forthSem();

        values.put(KEY_1401, String.valueOf(tmpForth[0]));
        values.put(KEY_1402, String.valueOf(tmpForth[1]));
        values.put(KEY_1403, String.valueOf(tmpForth[2]));
        values.put(KEY_1404, String.valueOf(tmpForth[3]));
        values.put(KEY_1405, String.valueOf(tmpForth[4]));
        values.put(KEY_1406, String.valueOf(tmpForth[5]));
        values.put(KEY_14L1, String.valueOf(tmpForth[6]));
        values.put(KEY_14L2, String.valueOf(tmpForth[7]));
        System.out.println("DatabaseHandler : Forth Sem Insertion successfull");
    }

    public void insertFifthSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpFifth = user.get_fifthSem();

        values.put(KEY_1501, String.valueOf(tmpFifth[0]));
        values.put(KEY_1502, String.valueOf(tmpFifth[1]));
        values.put(KEY_1503, String.valueOf(tmpFifth[2]));
        values.put(KEY_1504, String.valueOf(tmpFifth[3]));
        values.put(KEY_1505, String.valueOf(tmpFifth[4]));
        values.put(KEY_1506, String.valueOf(tmpFifth[5]));
        values.put(KEY_15L1, String.valueOf(tmpFifth[6]));
        values.put(KEY_15L2, String.valueOf(tmpFifth[7]));
        System.out.println("DatabaseHandler : Fifth Sem Insertion successfull");
    }

    public void insertSixthSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpSixth = user.get_sixthSem();

        values.put(KEY_1601, String.valueOf(tmpSixth[0]));
        values.put(KEY_1602, String.valueOf(tmpSixth[1]));
        values.put(KEY_1603, String.valueOf(tmpSixth[2]));
        values.put(KEY_1604, String.valueOf(tmpSixth[3]));
        values.put(KEY_1605, String.valueOf(tmpSixth[4]));
        values.put(KEY_1606, String.valueOf(tmpSixth[5]));
        values.put(KEY_16L1, String.valueOf(tmpSixth[6]));
        values.put(KEY_16L2, String.valueOf(tmpSixth[7]));
        System.out.println("DatabaseHandler : Sixth Sem Insertion successfull");
    }

    public void insertSeventhSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpSeventh = user.get_seventhSem();

        values.put(KEY_1701, String.valueOf(tmpSeventh[0]));
        values.put(KEY_1702, String.valueOf(tmpSeventh[1]));
        values.put(KEY_1703, String.valueOf(tmpSeventh[2]));
        values.put(KEY_1704, String.valueOf(tmpSeventh[3]));
        values.put(KEY_1705, String.valueOf(tmpSeventh[4]));
        values.put(KEY_17L1, String.valueOf(tmpSeventh[5]));
        values.put(KEY_17L2, String.valueOf(tmpSeventh[6]));
        values.put(KEY_17L3, String.valueOf(tmpSeventh[7]));
        System.out.println("DatabaseHandler : Sixth Sem Insertion successfull");
    }

    public void insertEighthSem(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        char[] tmpEighth = user.get_eighthSem();

        values.put(KEY_1801, String.valueOf(tmpEighth[0]));
        values.put(KEY_1802, String.valueOf(tmpEighth[1]));
        values.put(KEY_1803, String.valueOf(tmpEighth[2]));
        values.put(KEY_1804, String.valueOf(tmpEighth[3]));
        values.put(KEY_18L1, String.valueOf(tmpEighth[4]));
        values.put(KEY_18L2, String.valueOf(tmpEighth[5]));
        System.out.println("DatabaseHandler : Sixth Sem Insertion successfull");
    }


    // Other helper functions (if any)

}
