package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact , Integer> {

}
