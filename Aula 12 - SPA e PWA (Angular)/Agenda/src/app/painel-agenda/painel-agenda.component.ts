import { AgendaService } from './../agenda.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-painel-agenda',
  templateUrl: './painel-agenda.component.html',
  styleUrls: ['./painel-agenda.component.css']
})
export class PainelAgendaComponent implements OnInit {

  ag = { id: '', nome: '', telefone: '' }
  agenda = [];
  operacao = true;

  constructor(private agendaService : AgendaService) { }

  ngOnInit(): void {
    this.consultar();
  }

  consultar() {
    this.agendaService.listar()
    .subscribe(resposta => this.agenda = <any> resposta);
  }

  inserirOuAtualizar() {
    if (this.operacao) {
      this.adicionar();
    } else {
      this.atualizar();
      this.operacao = true;
    }
  }
  editar(ag: any) {
    this.ag = {id: ag.id, nome: ag.nome, telefone: ag.telefone};
    this.operacao = false;
  }
  atualizar() {
    this.agendaService.atualizar(this.ag).subscribe(() => {
      this.ag = {id: '', nome: '', telefone: ''};
      this.consultar();
    });
  }

  adicionar() {
    this.agendaService.adicionar(this.ag).subscribe(() => {
      this.ag = {id: '', nome: '', telefone: ''};
      this.consultar();
    });
  }

  excluir(id: number) {
    this.agendaService.excluir(id).subscribe(() => {
      this.consultar();
    });
  }
}
