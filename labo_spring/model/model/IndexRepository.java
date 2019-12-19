
package com.example.labo_spring.model.model;


        import com.example.labo_spring.labo.Index;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.stereotype.Repository;

        import java.util.List;
        import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@Repository
public class IndexRepository {
    @Autowired
    private JdbcTemplate jdbc;

    public List<Index> select(String laboClass){
        var sql = "Select * from laboAbout where laboClass = '" + laboClass +"';";
        return jdbc.query(sql,newInstance(Index.class));
    }
}
