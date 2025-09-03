@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public UserDTO getUserById(Long id) {
        User user = userDAO.findById(id).orElseThrow();
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }
}