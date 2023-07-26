package com.ars;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAO {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //This method saves book record
    public boolean saveBookRecord(Book book) {

        boolean insertionResult = false;

        String query = "insert into Book values(" + book.getId() + ", '" + book.getName() + "', " + book.getPrice() + ")";

        int result = jdbcTemplate.update(query);

        if(result > 0) {
            System.out.println("The book record has been inserted successfully.");
            insertionResult = true;
        }
        else {
            System.out.println("The insertion is not successful.");
        }

        return insertionResult;

    }

}
