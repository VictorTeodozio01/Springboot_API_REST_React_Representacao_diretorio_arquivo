// src/services/diretorioService.ts

import axios from 'axios';

const apiClient = axios.create({
  baseURL: 'http://localhost:8080/api', // URL da sua API Spring Boot
  headers: {
    'Content-Type': 'application/json',
  }
});

// Interface para representar os dados dos diretórios
export interface Arquivo {
  id: number;
  nome: string;
}

export interface Subdiretorio {
  id: number;
  nome: string;
}

export interface Diretorio {
  id: number;
  nome: string;
  subdiretorios: Subdiretorio[];
  arquivos: Arquivo[];
}

// Função para listar diretórios
export const listarDiretorios = async (): Promise<Diretorio[]> => {
    const response = await apiClient.get<Diretorio[]>('/diretorios');
    return response.data;
  };