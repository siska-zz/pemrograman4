public interface personDao{
  void save(person p);
  void delete(person p);
  person getById(Long id);
}