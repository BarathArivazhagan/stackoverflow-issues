package com.barath.app;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.HSQL)
public class WorkSiteRepositoryTest {

	@Autowired
	private IWorkSiteRepository workSiteRepository;

	public WorkSiteRepositoryTest() {
	    super ();
	}
	@BeforeEach
	public void setup() {

		List<WorkSiteEntity> workSite = Arrays.asList (

				new WorkSiteEntity (1,
						"testname", "aa", "aa", "aa", "1100",
						"testaddress", null, null, null, null, null, null, null,
						"9", "2342", "326"),
				new WorkSiteEntity (2,
						"testname", "aa", "aa", "aa", "1200",
						"testaddress", null, null, null, null, null, null, null,
						"9", "623", "436"),
				new WorkSiteEntity (3,
						"testname", "aa", "aa", "aa", "1300",
						"testaddress", null, null, null, null, null, null, null,
						"9", "342", "567"),
				new WorkSiteEntity (4,
						"testname", "aa", "aa", "aa", "1400",
						"testaddress", null, null, null, null, null, null, null,
						"9", "543", "8567"),
				new WorkSiteEntity (5,
						"testname", "aa", "aa", "aa", "1900",
						"testaddress", null, null, null, null, null, null, null,
						"9", "7754", "885")
		);

		this.workSiteRepository.saveAll(workSite);
	}

	@AfterEach
	public void release() {

		this.workSiteRepository.deleteAll();
	}

	@Test
	@DisplayName ("Find a WorkSite Entity By Id.")
	public void TestFind () {

		WorkSiteEntity workSite;
		Long id = Long.valueOf(1); // PK to search.

		workSite = this.workSiteRepository.findById(id).get(); // This is line 137

		assertNotNull(workSite, "[FINDBY] WorkSite " + id + " not found!");
	}

	@Test
	@DisplayName ("Update a WorkSite Entity By Id.")
	public void TestUpdt () {

		WorkSiteEntity workSite;
		Long id = Long.valueOf(6); // PK to search.

		workSite = this.workSiteRepository.findById(id).get();

		assertNotNull (workSite, "[UPDATE] WorkSite " + id + " not found!");

		String before = workSite.getFullName ();
		workSite.setFullName (before.toUpperCase());
		this.workSiteRepository.saveAndFlush(workSite);

		workSite = this.workSiteRepository.findById(id).get(); // This is line 161

		assertNotNull (workSite, "[UPDATE] WorkSite not " + id + " found!");
		assertEquals (before.toUpperCase (), workSite.getFullName (), "[UPDATE] Update process failed!");
	}

	@Test
	@DisplayName ("Delete a WorkSite Entity By Id.")
	public void TestDelete () {

		WorkSiteEntity workSite;
		Long id = Long.valueOf(11); // PK to search.

		this.workSiteRepository.deleteById(id); // This is line 198

		workSite = this.workSiteRepository.findById(id).orElse(null);
		assertNull (workSite, "[DELETE] WorkSite " + id + " found!");
	}

	@Test
	@DisplayName ("Find all WorkSites")
	public void TestFindAll () {

		List<WorkSiteEntity> workSite;

		workSite = this.workSiteRepository.findAll();

		assertNotNull (workSite, "[FINDALL] WorkSite not found (NULL)!");
		assertFalse (workSite.isEmpty (), "[FINDALL] WorkSite not found (Empty)!");
	}
}

