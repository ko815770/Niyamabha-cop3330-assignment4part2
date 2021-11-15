package ucf.assignments;


import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();
    @org.junit.jupiter.api.Test
    void setTitle() {
        list.setTitle("title");
        assertEquals("title", list.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setDate() {
        list.setDate("2042-11-19");
        assertEquals("2042-11-19", list.getDate());
    }

    @org.junit.jupiter.api.Test
    void setDes() {
        list.setDes("Description");
        assertEquals("Description", list.getDes());
    }

}