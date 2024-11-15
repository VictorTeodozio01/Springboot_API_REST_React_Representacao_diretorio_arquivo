// src/App.tsx

import React from 'react';
import DiretorioList from '../components/DiretorioList';



const App: React.FC = () => {
  return (
    <div className="bg-gray-100 min-h-screen flex flex-col items-center justify-center">
      <header className="bg-white shadow w-full py-6">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <h1 className="text-3xl font-bold leading-tight text-gray-900 text-center">
            Mini Sistema de Arquivos
          </h1>
        </div>
      </header>

      <main className="w-full px-4 sm:px-6 lg:px-8 py-12">
        <DiretorioList />
      </main>
    </div>
  );
};

export default App;
