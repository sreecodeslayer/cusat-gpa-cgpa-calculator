package imsreenadh.gpacgpa;

/**
 * Created by Sreenadh TC on 25-05-2016.
 */
public class User {
    int _id;
    String _regnum, _name;
    char[] _firstYear;
    char[] _thirdSem;
    char[] _forthSem;
    char[] _fifthSem;
    char[] _sixthSem;
    char[] _seventhSem;
    char[] _eighthSem;

    /* char _1301,_1302,_1303,_1304,_1305,_1306,_13L1,_13L2;
    char _1401,_1402,_1403,_1404,_1405,_1406,_14L1,_14L2;
    char _1501,_1502,_1503,_1504,_1505,_1506,_15L1,_15L2;
    char _1601,_1602,_1603,_1604,_1605,_1606,_16L1,_16L2;
    char _1701,_1702,_1703,_1704,_1705,_17L1,_17L2,_17L3,_17L4;
    char _1801,_1802,_1803,_1804,_1805,_18L1,_18L2; */


    // empty contructor **required**
    public User() {

    }

    // constructor
    public User(
            int id,
            String name,
            String regnum,
            char[] firstYear,
            char[] thirdSem,
            char[] forthSem,
            char[] fifthSem,
            char[] sixthSem,
            char[] seventhSem,
            char[] eighthSem
    ) {

        this._id = id;
        this._name = name;
        this._regnum = regnum;
        this._firstYear = firstYear;
        this._thirdSem = thirdSem;
        this._forthSem = forthSem;
        this._fifthSem = fifthSem;
        this._sixthSem = sixthSem;
        this._seventhSem = seventhSem;
        this._eighthSem = eighthSem;

    }

    // constructor
    public User(
            String name,
            String regnum,
            char[] firstYear,
            char[] thirdSem,
            char[] forthSem,
            char[] fifthSem,
            char[] sixthSem,
            char[] seventhSem,
            char[] eighthSem
    ) {

        this._name = name;
        this._regnum = regnum;
        this._firstYear = firstYear;
        this._thirdSem = thirdSem;
        this._forthSem = forthSem;
        this._fifthSem = fifthSem;
        this._sixthSem = sixthSem;
        this._seventhSem = seventhSem;
        this._eighthSem = eighthSem;

    }

    // Getters

    public int get_id() {
        return _id;
    }

    public String get_regnum() {
        return _regnum;
    }

    public String get_name() {
        return _name;
    }

    public char[] get_firstYear() {
        return _firstYear;
    }

    public char[] get_thirdSem() {
        return _thirdSem;
    }

    public char[] get_forthSem() {
        return _forthSem;
    }

    public char[] get_fifthSem() {
        return _fifthSem;
    }

    public char[] get_sixthSem() {
        return _sixthSem;
    }

    public char[] get_seventhSem() {
        return _seventhSem;
    }

    public char[] get_eighthSem() {
        return _eighthSem;
    }



    // Setters

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_regnum(String _regnum) {
        this._regnum = _regnum;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_firstYear(char[] _firstYear) {
        this._firstYear = _firstYear;
    }

    public void set_thirdSem(char[] _thirdSem) {
        this._thirdSem = _thirdSem;
    }

    public void set_forthSem(char[] _forthSem) {
        this._forthSem = _forthSem;
    }

    public void set_fifthSem(char[] _fifthSem) {
        this._fifthSem = _fifthSem;
    }

    public void set_sixthSem(char[] _sixthSem) {
        this._sixthSem = _sixthSem;
    }

    public void set_seventhSem(char[] _seventhSem) {
        this._seventhSem = _seventhSem;
    }

    public void set_eighthSem(char[] _eighthSem) {
        this._eighthSem = _eighthSem;
    }


}
