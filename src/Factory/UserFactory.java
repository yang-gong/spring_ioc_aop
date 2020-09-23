package Factory;

import entity.User;

public class UserFactory {
	public static User getuser() {
		return new User();
	}
}
