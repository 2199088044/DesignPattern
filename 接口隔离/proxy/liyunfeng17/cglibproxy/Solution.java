package cn.dada.接口隔离.proxy.liyunfeng17.cglibproxy;

public class Solution
{
    public static void main(String[] args)
    {
        BookServiceImpl bookFacade = new BookServiceImpl();
        BookServiceCglib cglib = new BookServiceCglib();
        BookServiceImpl bookCglib = (BookServiceImpl) cglib.getInstance(bookFacade);

        bookCglib.addBook();
//        bookCglib.deleteBook();
    }
}