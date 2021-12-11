/*
package ru.pcs.web.springbootweb.repositories.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.pcs.web.springbootweb.models.User;

import javax.sql.DataSource;
import java.util.List;

@Component
public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into account(first_name, last_name, age) values(?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL="select * from account order by id";

    //language=SQL
    private static final String SQL_DELETE_BY_ID = "DELETE FROM account where id = ?;";

    //language=SQL
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM account WHERE id=?";


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, userRowMapper);
    }

    // конвертируем строку в конкретный объект
    private static final RowMapper<User> userRowMapper = (row, rowNumber) -> {
        int id = row.getInt("id");
        String firstName = row.getString("first_name");
        String lastName = row.getString("last_name");
        int age = row.getInt("age");
        return new User(id, firstName, lastName, age);
    };

    @Override
    public void save(User user) {
        jdbcTemplate.update(SQL_INSERT, user.getFirstName(), user.getLastName(), user.getAge());
    }

    @Override
    public void delete(Long userId) {
        jdbcTemplate.update(SQL_DELETE_BY_ID, userId);
    }

    @Override
    public User findById(Long userId) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, userRowMapper, userId);
    }
}
*/
