package readinglist.platform.entity;

import java.util.Arrays;
import java.util.Collection;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

//@Entity
public class Reader {

	private static final long serialVersionUID = 684366572534987303L;

	
	//@Id
	private String username;
	private String fullname;
	private String password;
	
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Arrays.asList(new SimpleGrantedAuthority("READER"));  //授予READER权限
//	}
//
//
//	
//	
//
//	@Override
//	public boolean isAccountNonExpired() {
//		
//		return true;
//	}

//	@Override
//	public boolean isAccountNonLocked() {
//		// 不过期，不加锁，不禁用
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}




}
