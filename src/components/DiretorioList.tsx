import React, { useEffect, useState } from 'react';
import { fetchDiretorios } from '../api/api';
//import Image from "next/image";
//import "./globals.css";


interface Diretorio {
  id: number;
  nome: string;
  subdiretorios: Diretorio[];
  arquivos: Arquivo[];
}

interface Arquivo {
  id: number;
  nome: string;
}

const DiretorioList: React.FC = () => {
  const [diretorios, setDiretorios] = useState<Diretorio[]>([]);

  useEffect(() => {
    const loadDiretorios = async () => {
      try {
        const response = await fetchDiretorios();
        const data = response.data.map((diretorio: Diretorio) => ({
          ...diretorio,
          subdiretorios: diretorio.subdiretorios || [], 
          arquivos: diretorio.arquivos || [], 
        }));
        setDiretorios(data);
      } catch (error) {
        console.error("Erro ao buscar diretórios:", error);
      }
    };
    loadDiretorios();
  }, []);

  const renderDiretorios = (diretorios: Diretorio[]) => {
    return (
      <ul className="ml-4">
        {diretorios.map((diretorio) => (
          <li key={diretorio.id}>
            <p className="font-semibold text-indigo-600">{diretorio.nome}</p>
            {diretorio.arquivos.length > 0 && (
              <ul className="ml-4">
                {diretorio.arquivos.map((arquivo) => (
                  <li key={arquivo.id} className="text-gray-600">
                    {arquivo.nome}
                  </li>
                ))}
              </ul>
            )}
            {diretorio.subdiretorios.length > 0 && renderDiretorios(diretorio.subdiretorios)}
          </li>
        ))}
      </ul>
    );
  };

  return (
    <div className="max-w-4xl mx-auto py-12">
      <h1 className="text-3xl font-bold text-blue-500 mb-6">Listagem de Diretórios</h1>
      {renderDiretorios(diretorios)}
    </div>
  );
};

export default DiretorioList;
