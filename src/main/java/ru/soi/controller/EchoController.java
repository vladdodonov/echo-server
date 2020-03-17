package ru.soi.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.ResponseEntity.ok;

@Log4j
@RestController
@RequestMapping("/")
public class EchoController<T> {

    @PostMapping("/")
    public ResponseEntity<String> post(@RequestBody T request, HttpServletRequest req) {
        final String logString = "Тип запроса: POST, IP-адрес: " + req.getRemoteAddr() + ", запрос: " + request.toString();
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @GetMapping("/{var}")
    public ResponseEntity<String> get(@PathVariable String var, HttpServletRequest req) {
        final String logString = "Тип запроса: GET, IP-адрес: " + req.getRemoteAddr() + ", запрос: " + var;
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @GetMapping("/")
    public ResponseEntity<String> getEmpty(HttpServletRequest req) {
        final String logString = "Тип запроса: GET, IP-адрес: " + req.getRemoteAddr() + ", запрос: пустой запрос";
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @PutMapping("/")
    public ResponseEntity<String> put(@RequestBody T request, HttpServletRequest req) {
        final String logString = "Тип запроса: PUT, IP-адрес: " + req.getRemoteAddr() + ", запрос: " + request.toString();
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @PatchMapping("/")
    public ResponseEntity<String> patch(@RequestBody T request, HttpServletRequest req) {
        final String logString = "Тип запроса: PATCH, IP-адрес: " + req.getRemoteAddr() + ", запрос: " + request.toString();
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @DeleteMapping("/{var}")
    public ResponseEntity<String> delete(@PathVariable String var, HttpServletRequest req) {
        final String logString = "Тип запроса: DELETE, IP-адрес: " + req.getRemoteAddr() + ", запрос: " + var;
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }

    @DeleteMapping("/")
    public ResponseEntity<String> deleteEmpty(HttpServletRequest req) {
        final String logString = "Тип запроса: DELETE, IP-адрес: " + req.getRemoteAddr() + ", запрос: пустой запрос";
        log.info(logString);
        return ok("Получен запрос: " + logString);
    }
}
