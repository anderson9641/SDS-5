import DataTable from './components/dataTable';
import NaveBar from './components/naveBar';
import Footer from './components/footer'
import BarCharts from './components/barCharts';
import DonutCharts from './components/donutChart';

function App() {

  return (
    <>
      <NaveBar />
      <div className="container">
        <h1 className="text-primary py-3">DashBoard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Porcentagem de Sucesso</h5>
            <BarCharts/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Todas as vendas</h5>
            <DonutCharts/>
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  )
}

export default App
