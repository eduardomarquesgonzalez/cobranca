package br.gov.mt.cuiaba.cobranca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.gov.mt.cuiaba.cobranca.model.Usuario;
import br.gov.mt.cuiaba.cobranca.repository.UsuarioRepository;

public class ImplementsUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = ur.findByLogin(login);
			
		}
		return null;
	}

}
