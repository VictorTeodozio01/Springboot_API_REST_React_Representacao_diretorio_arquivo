// src/api/api.ts

import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api', // URL base da sua API
});

export const fetchDiretorios = () => api.get('/diretorios');
export const createDiretorio = (diretorio: { nome: string }) => api.post('/diretorios', diretorio);
export const updateDiretorio = (id: number, diretorio: { nome: string }) => api.put(`/diretorios/${id}`, diretorio);
export const deleteDiretorio = (id: number) => api.delete(`/diretorios/${id}`);
