package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import hello.hellospring.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateMemberRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate();
    }

    @Override
    public Member save(Member member) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return jdbcTemplate.query("select * from member where id = ?", pss, rse);
    }

    @Override
    public Optional<Member> findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Member> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    private RowMapper<Member> memberRowMapper() {
        return new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                return member;
            }
        };
    }

    // private org.springframework.jdbc.core.RowMapper<Member> memberRowMapper() {
    //     return (rs, rowNum) -> {
    //         Member member = new Member();
    //         member.setId(rs.getLong("id"));
    //         member.setName(rs.getString("name"));
    //         return member;
    //     };
    // }
    
}
