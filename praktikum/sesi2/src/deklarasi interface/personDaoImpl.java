public class personDaoImpl implements personDao{
      public void save(person p){
	        System.out.println("menyimpan person");
	  }
	  public void delete(person p){
	        System.out.println("manghapus person");
	  }
	  public person getById(Long id){
	  person p = new person();
	  p.setId(id);
	  p.setNama("abc");
	  return p;
	  }
}