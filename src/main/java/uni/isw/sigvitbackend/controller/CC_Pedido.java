package uni.isw.sigvitbackend.controller;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.isw.sigvitbackend.dto.ClienteRequest;
import uni.isw.sigvitbackend.dto.ClienteResponse;
import uni.isw.sigvitbackend.service.ClienteService;
import uni.isw.sigvitbackend.utils.ErrorResponse;

@RestController
@RequestMapping(path = "api/v1/pedido")
public class CC_Pedido {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    ClienteService clienteService;
    
    
    public void PrepararEntrega(){}

    public void PrepararPago(){}

    public void PrepararDetalle(){}

    public void ValidarTarjeta(){}

    public void Aceptado(){}

    public void AbrirComunicación(){}
}
