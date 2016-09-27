package pojo.test.dao;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pojo.web.util.DBUtil;

public class DbTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Sessiontest() {
		SqlSession session = DBUtil.getInstance().getSession();
		assertThat(session,is(notNullValue()));
	}

}
