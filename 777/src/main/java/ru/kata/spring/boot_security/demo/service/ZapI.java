package ru.kata.spring.boot_security.demo.service;

public class ZapI {
    /*
    @Service
@Transactional
public class UserServiceImpl implements UserService{

    @PersistenceContext
    @Resource
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public void addUser(User user_reg) {
        User user = new User(user_reg.getFirstName(),user_reg.getLastName(), user_reg.getEmail(),
                passwordEncoder.encode(user_reg.getPassword()),user_reg.getRoles());
        getEntityManager().persist(user);
    }

    public List<User> getAllUsers() {
        return getEntityManager()
                .createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = entityManager.createQuery("SELECT u FROM User u join fetch u.roles where u.email = :name", User.class)
                .setParameter("name", username)
                .getSingleResult();
        return user;
    }

    public User getUserById(Long id) {
        return getEntityManager().find(User.class, id);
    }


    public void deleteUser(Long id) {
        User user = getEntityManager().find(User.class, id);
        this.entityManager.remove(user);
        this.entityManager.flush();
    }
    public void editUser(User user) {
        User managed = entityManager.merge(user);
        entityManager.persist(managed);
    }
}
     */
}
