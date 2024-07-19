package br.com.danielsilva.dao;

import br.com.danielsilva.domain.Cliente;

    public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

        public ClienteDAO() {
            super(Cliente.class);
        }


}
