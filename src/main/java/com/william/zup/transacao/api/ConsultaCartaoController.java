package com.william.zup.transacao.api;

import com.william.zup.transacao.api.request.TransacaoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ConsultaCartaoController {

    @PersistenceContext
    private EntityManager manager;


    @GetMapping("/api/consulta")
    public ResponseEntity<?> consultaUltimasCompras(@RequestParam String id) {


        Query query = manager.createQuery("FROM Transacao WHERE cartao.idCartao = :ID ORDER BY efetivadoEm DESC ");

        query.setParameter("ID", id);
        query.setMaxResults(10);
        List<Transacao> resultList = query.getResultList();

        if (resultList.size() > 0) {
            List<TransacaoRequest> retorno = resultList.stream().map(TransacaoRequest::new).collect(Collectors.toList());
            return ResponseEntity.ok().body(retorno);
        }


        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
