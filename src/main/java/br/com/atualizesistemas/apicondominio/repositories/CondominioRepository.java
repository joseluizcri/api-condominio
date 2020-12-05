package br.com.atualizesistemas.apicondominio.repositories;

import br.com.atualizesistemas.apicondominio.models.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondominioRepository extends JpaRepository<Condominio, Long> {
}
