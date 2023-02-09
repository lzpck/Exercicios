class Aluno {
    constructor(nome, cpf, codTurma) {
        this.nome = nome;
        this.cpf = cpf;
        this.codTurma = codTurma;
    }

    getNome() {
        return this.nome;
    }

    getCpf() {
        return this.cpf;
    }

    getCodTurma() {
        return this.codTurma;
    }

    imprimeDados() {
        console.log(`Nome: ${this.nome}`);
        console.log(`CPF: ${this.cpf}`);
        console.log(`Código da Turma: ${this.codTurma}`);
    }
}

const aluno = new Aluno("João Silva", "123.456.789-00", 1);
aluno.imprimeDados();